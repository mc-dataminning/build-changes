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

public class cua extends ezm {
   private static final String d = "raids";
   public static final Codec<cua> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cua.a.a.listOf().optionalFieldOf("raids", List.of()).forGetter($$0x -> $$0x.e.int2ObjectEntrySet().stream().map(cua.a::a).toList()),
               Codec.INT.fieldOf("next_id").forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("tick").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cua::new)
   );
   public static final ezn<cua> b = new ezn<>("raids", cua::new, a, bbo.l);
   public static final ezn<cua> c = new ezn<>("raids_end", cua::new, a, bbo.l);
   private final Int2ObjectMap<cty> e = new Int2ObjectOpenHashMap();
   private int f = 1;
   private int g;

   public static ezn<cua> a(jg<efn> $$0) {
      return $$0.a(efl.c) ? c : b;
   }

   public cua() {
      this.f();
   }

   private cua(List<cua.a> $$0, int $$1, int $$2) {
      for (cua.a $$3 : $$0) {
         this.e.put($$3.b, $$3.c);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public cty a(int $$0) {
      return (cty)this.e.get($$0);
   }

   public OptionalInt a(cty $$0) {
      ObjectIterator var2 = this.e.int2ObjectEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<cty> $$1 = (Entry<cty>)var2.next();
         if ($$1.getValue() == $$0) {
            return OptionalInt.of($$1.getIntKey());
         }
      }

      return OptionalInt.empty();
   }

   public void a(asb $$0) {
      this.g++;
      Iterator<cty> $$1 = this.e.values().iterator();

      while ($$1.hasNext()) {
         cty $$2 = $$1.next();
         if ($$0.O().c(dkf.D)) {
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

      agx.a($$0, this.e.values());
   }

   public static boolean a(ctz $$0) {
      return $$0.bJ() && $$0.gH() && $$0.ew() <= 2400;
   }

   @Nullable
   public cty a(asc $$0, iw $$1) {
      if ($$0.ak()) {
         return null;
      } else {
         asb $$2 = $$0.x();
         if ($$2.O().c(dkf.D)) {
            return null;
         } else {
            efn $$3 = $$2.F_();
            if (!$$3.c()) {
               return null;
            } else {
               List<cji> $$4 = $$2.A().c($$0x -> $$0x.a(axx.b), $$1, 64, cjh.b.b).toList();
               int $$5 = 0;
               fgc $$6 = fgc.c;

               for (cji $$7 : $$4) {
                  iw $$8 = $$7.g();
                  $$6 = $$6.b((double)$$8.u(), (double)$$8.v(), (double)$$8.w());
                  $$5++;
               }

               iw $$9;
               if ($$5 > 0) {
                  $$6 = $$6.c(1.0 / (double)$$5);
                  $$9 = iw.a((jq)$$6);
               } else {
                  $$9 = $$1;
               }

               cty $$11 = this.a($$2, $$9);
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

   private cty a(asb $$0, iw $$1) {
      cty $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cty($$1, $$0.an());
   }

   public static cua a(ua $$0) {
      return a.parse(uo.a, $$0).resultOrPartial().orElseGet(cua::new);
   }

   private int a() {
      return ++this.f;
   }

   @Nullable
   public cty a(iw $$0, int $$1) {
      cty $$2 = null;
      double $$3 = (double)$$1;
      ObjectIterator var6 = this.e.values().iterator();

      while (var6.hasNext()) {
         cty $$4 = (cty)var6.next();
         double $$5 = $$4.q().j($$0);
         if ($$4.r() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }

   static record a(int b, cty c) {
      public static final Codec<cua.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("id").forGetter(cua.a::a), cty.b.forGetter(cua.a::b)).apply($$0, cua.a::new)
      );

      public static cua.a a(Entry<cty> $$0) {
         return new cua.a($$0.getIntKey(), (cty)$$0.getValue());
      }

      public int a() {
         return this.b;
      }

      public cty b() {
         return this.c;
      }
   }
}
