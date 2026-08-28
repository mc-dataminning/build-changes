import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record czg(List<czg.a> e) implements cym, czi {
   public static final czg a = new czg(List.of());
   public static final int b = 160;
   public static final Codec<czg> c = czg.a.a.listOf().xmap(czg::new, czg::a);
   public static final zj<ww, czg> d = czg.a.b.a(zh.a()).a(czg::new, czg::a);

   public czg a(czg.a $$0) {
      return new czg(ae.a(this.e, $$0));
   }

   @Override
   public void a(dff $$0, bve $$1, cwf $$2, cyl $$3) {
      for (czg.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cwb.b $$0, Consumer<xl> $$1, cxx $$2) {
      if ($$2.b()) {
         List<btn> $$3 = new ArrayList<>();

         for (czg.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cye.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<czg.a> a() {
      return this.e;
   }

   public static record a(jq<btl> c, int d) {
      public static final Codec<czg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btl.a.fieldOf("id").forGetter(czg.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(czg.a::c))
               .apply($$0, czg.a::new)
      );
      public static final zj<ww, czg.a> b = zj.a(btl.b, czg.a::b, zh.h, czg.a::c, czg.a::new);

      public btn a() {
         return new btn(this.c, this.d);
      }

      public jq<btl> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
