import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ctp extends eza {
   private static final String d = "raids";
   public static final Codec<ctp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ctp.a.a.listOf().optionalFieldOf("raids", List.of()).forGetter($$0x -> $$0x.e.int2ObjectEntrySet().stream().map(ctp.a::a).toList()),
               Codec.INT.fieldOf("next_id").forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("tick").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ctp::new)
   );
   public static final ezb<ctp> b = new ezb<>("raids", ctp::new, a, bbd.l);
   public static final ezb<ctp> c = new ezb<>("raids_end", ctp::new, a, bbd.l);
   private final Int2ObjectMap<ctn> e = new Int2ObjectOpenHashMap();
   private int f = 1;
   private int g;

   public static ezb<ctp> a(jf<efb> $$0) {
      return $$0.a(eez.c) ? c : b;
   }

   public ctp() {
      this.f();
   }

   private ctp(List<ctp.a> $$0, int $$1, int $$2) {
      for (ctp.a $$3 : $$0) {
         this.e.put($$3.b, $$3.c);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public ctn a(int $$0) {
      return (ctn)this.e.get($$0);
   }

   public OptionalInt a(ctn $$0) {
      ObjectIterator var2 = this.e.int2ObjectEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<ctn> $$1 = (Entry<ctn>)var2.next();
         if ($$1.getValue() == $$0) {
            return OptionalInt.of($$1.getIntKey());
         }
      }

      return OptionalInt.empty();
   }

   public void a(ars $$0) {
      this.g++;
      Iterator<ctn> $$1 = this.e.values().iterator();

      while ($$1.hasNext()) {
         ctn $$2 = $$1.next();
         if ($$0.O().c(djt.D)) {
            $$2.m();
         }

         if ($$2.d()) {
            $$1.remove();
            this.f();
         } else {
            $$2.a($$0);
         }
      }

      if (this.g % 200 == 0) {
         this.f();
      }

      ago.a($$0, this.e.values());
   }

   public static boolean a(cto $$0) {
      return $$0.bJ() && $$0.gE() && $$0.ew() <= 2400;
   }

   @Nullable
   public ctn a(art $$0, iv $$1) {
      if ($$0.Z_()) {
         return null;
      } else {
         ars $$2 = $$0.y();
         if ($$2.O().c(djt.D)) {
            return null;
         } else {
            efb $$3 = $$2.F_();
            if (!$$3.c()) {
               return null;
            } else {
               List<cix> $$4 = $$2.A().c($$0x -> $$0x.a(axo.b), $$1, 64, ciw.b.b).toList();
               int $$5 = 0;
               ffq $$6 = ffq.c;

               for (cix $$7 : $$4) {
                  iv $$8 = $$7.g();
                  $$6 = $$6.b((double)$$8.u(), (double)$$8.v(), (double)$$8.w());
                  $$5++;
               }

               iv $$9;
               if ($$5 > 0) {
                  $$6 = $$6.c(1.0 / (double)$$5);
                  $$9 = iv.a((jp)$$6);
               } else {
                  $$9 = $$1;
               }

               ctn $$11 = this.a($$2, $$9);
               if (!$$11.i() && !this.e.containsValue($$11)) {
                  this.e.put(this.a(), $$11);
               }

               if (!$$11.i() || $$11.l() < $$11.k()) {
                  $$11.a($$0);
               }

               this.f();
               return $$11;
            }
         }
      }
   }

   private ctn a(ars $$0, iv $$1) {
      ctn $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new ctn($$1, $$0.an());
   }

   public static ctp a(tz $$0) {
      return a.parse(un.a, $$0).resultOrPartial().orElseGet(ctp::new);
   }

   private int a() {
      return ++this.f;
   }

   @Nullable
   public ctn a(iv $$0, int $$1) {
      ctn $$2 = null;
      double $$3 = (double)$$1;
      ObjectIterator var6 = this.e.values().iterator();

      while (var6.hasNext()) {
         ctn $$4 = (ctn)var6.next();
         double $$5 = $$4.q().j($$0);
         if ($$4.r() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }

   static record a(int b, ctn c) {
      public static final Codec<ctp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("id").forGetter(ctp.a::a), ctn.b.forGetter(ctp.a::b)).apply($$0, ctp.a::new)
      );

      public static ctp.a a(Entry<ctn> $$0) {
         return new ctp.a($$0.getIntKey(), (ctn)$$0.getValue());
      }

      public int a() {
         return this.b;
      }

      public ctn b() {
         return this.c;
      }
   }
}
