import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record cyw(List<cyw.a> e) implements cye, cyy {
   public static final cyw a = new cyw(List.of());
   public static final int b = 160;
   public static final Codec<cyw> c = cyw.a.a.listOf().xmap(cyw::new, cyw::a);
   public static final zf<ws, cyw> d = cyw.a.b.a(zd.a()).a(cyw::new, cyw::a);

   public cyw a(cyw.a $$0) {
      return new cyw(ad.a(this.e, $$0));
   }

   @Override
   public void a(dev $$0, buv $$1, cvx $$2, cyd $$3) {
      for (cyw.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      if ($$2.b()) {
         List<bte> $$3 = new ArrayList<>();

         for (cyw.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cxw.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<cyw.a> a() {
      return this.e;
   }

   public static record a(jp<btc> c, int d) {
      public static final Codec<cyw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btc.a.fieldOf("id").forGetter(cyw.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cyw.a::c))
               .apply($$0, cyw.a::new)
      );
      public static final zf<ws, cyw.a> b = zf.a(btc.b, cyw.a::b, zd.h, cyw.a::c, cyw.a::new);

      public bte a() {
         return new bte(this.c, this.d);
      }

      public jp<btc> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
