import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dah(List<dah.a> e) implements czn, daj {
   public static final dah a = new dah(List.of());
   public static final int b = 160;
   public static final Codec<dah> c = dah.a.a.listOf().xmap(dah::new, dah::a);
   public static final zi<wv, dah> d = dah.a.b.a(zg.a()).a(dah::new, dah::a);

   public dah a(dah.a $$0) {
      return new dah(ae.a(this.e, $$0));
   }

   @Override
   public void a(dgz $$0, bvx $$1, cxg $$2, czm $$3) {
      for (dah.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cxc.b $$0, Consumer<xk> $$1, cyy $$2) {
      if ($$2.b()) {
         List<bug> $$3 = new ArrayList<>();

         for (dah.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         czf.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<dah.a> a() {
      return this.e;
   }

   public static record a(jq<bue> c, int d) {
      public static final Codec<dah.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bue.a.fieldOf("id").forGetter(dah.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dah.a::c))
               .apply($$0, dah.a::new)
      );
      public static final zi<wv, dah.a> b = zi.a(bue.b, dah.a::b, zg.h, dah.a::c, dah.a::new);

      public bug a() {
         return new bug(this.c, this.d);
      }

      public jq<bue> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
