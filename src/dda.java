import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dda(List<dda.a> e) implements dce, ddd {
   public static final dda a = new dda(List.of());
   public static final int b = 160;
   public static final Codec<dda> c = dda.a.a.listOf().xmap(dda::new, dda::a);
   public static final yy<wl, dda> d = dda.a.b.a(yw.a()).a(dda::new, dda::a);

   public dda a(dda.a $$0) {
      return new dda(ag.a(this.e, $$0));
   }

   @Override
   public void a(djx $$0, bxu $$1, czy $$2, dcd $$3) {
      for (dda.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      if ($$2.b()) {
         List<bvx> $$4 = new ArrayList<>();

         for (dda.a $$5 : this.e) {
            $$4.add($$5.a());
         }

         dbu.a($$4, $$1, 1.0F, $$0.b());
      }
   }

   public List<dda.a> a() {
      return this.e;
   }

   public static record a(jf<bvv> c, int d) {
      public static final Codec<dda.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvv.a.fieldOf("id").forGetter(dda.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dda.a::c))
               .apply($$0, dda.a::new)
      );
      public static final yy<wl, dda.a> b = yy.a(bvv.b, dda.a::b, yw.h, dda.a::c, dda.a::new);

      public bvx a() {
         return new bvx(this.c, this.d);
      }

      public jf<bvv> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
