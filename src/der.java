import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class der implements dep {
   final Optional<ddq> c;
   final ddq d;
   final Optional<ddq> e;
   final dex f;
   @Nullable
   private ddt g;

   public der(Optional<ddq> $$0, ddq $$1, Optional<ddq> $$2, dex $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public czd a(deq $$0, jg.a $$1) {
      return this.f.a($$0.d());
   }

   @Override
   public Optional<ddq> c() {
      return this.c;
   }

   @Override
   public ddq f() {
      return this.d;
   }

   @Override
   public Optional<ddq> k() {
      return this.e;
   }

   @Override
   public dee<der> a() {
      return dee.t;
   }

   @Override
   public ddt al_() {
      if (this.g == null) {
         this.g = ddt.a(List.of(this.c, Optional.of(this.d), this.e));
      }

      return this.g;
   }

   @Override
   public List<dfa> g() {
      return List.of(new dfj(ddq.a(this.c), this.d.c(), ddq.a(this.e), this.f.a(), new dfg.d(czh.xB)));
   }

   public static class a implements dee<der> {
      private static final MapCodec<der> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddq.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  ddq.d.fieldOf("base").forGetter($$0x -> $$0x.d),
                  ddq.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  dex.a.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, der::new)
      );
      public static final yw<wj, der> w = yw.a(ddq.b, $$0 -> $$0.c, ddq.a, $$0 -> $$0.d, ddq.b, $$0 -> $$0.e, dex.b, $$0 -> $$0.f, der::new);

      @Override
      public MapCodec<der> a() {
         return x;
      }

      @Override
      public yw<wj, der> b() {
         return w;
      }
   }
}
