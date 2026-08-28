import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record czp(List<czp.a> e) implements cyv, czr {
   public static final czp a = new czp(List.of());
   public static final int b = 160;
   public static final Codec<czp> c = czp.a.a.listOf().xmap(czp::new, czp::a);
   public static final yn<wa, czp> d = czp.a.b.a(yl.a()).a(czp::new, czp::a);

   public czp a(czp.a $$0) {
      return new czp(af.a(this.e, $$0));
   }

   @Override
   public void a(dgh $$0, bvg $$1, cwo $$2, cyu $$3) {
      for (czp.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cwk.b $$0, Consumer<wp> $$1, cyg $$2) {
      if ($$2.b()) {
         List<btp> $$3 = new ArrayList<>();

         for (czp.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cyn.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<czp.a> a() {
      return this.e;
   }

   public static record a(jr<btn> c, int d) {
      public static final Codec<czp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btn.a.fieldOf("id").forGetter(czp.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(czp.a::c))
               .apply($$0, czp.a::new)
      );
      public static final yn<wa, czp.a> b = yn.a(btn.b, czp.a::b, yl.h, czp.a::c, czp.a::new);

      public btp a() {
         return new btp(this.c, this.d);
      }

      public jr<btn> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
