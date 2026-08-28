import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record czr(List<czr.a> e) implements cyx, czt {
   public static final czr a = new czr(List.of());
   public static final int b = 160;
   public static final Codec<czr> c = czr.a.a.listOf().xmap(czr::new, czr::a);
   public static final yn<wa, czr> d = czr.a.b.a(yl.a()).a(czr::new, czr::a);

   public czr a(czr.a $$0) {
      return new czr(af.a(this.e, $$0));
   }

   @Override
   public void a(dgj $$0, bvi $$1, cwq $$2, cyw $$3) {
      for (czr.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cwm.b $$0, Consumer<wp> $$1, cyi $$2) {
      if ($$2.b()) {
         List<btr> $$3 = new ArrayList<>();

         for (czr.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cyp.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<czr.a> a() {
      return this.e;
   }

   public static record a(jr<btp> c, int d) {
      public static final Codec<czr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btp.a.fieldOf("id").forGetter(czr.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(czr.a::c))
               .apply($$0, czr.a::new)
      );
      public static final yn<wa, czr.a> b = yn.a(btp.b, czr.a::b, yl.h, czr.a::c, czr.a::new);

      public btr a() {
         return new btr(this.c, this.d);
      }

      public jr<btp> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
