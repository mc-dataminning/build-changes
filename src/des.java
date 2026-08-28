import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class des implements dep {
   final ddq c;
   final ddq d;
   final ddq e;
   final je<dhs> f;
   @Nullable
   private ddt g;

   public des(ddq $$0, ddq $$1, ddq $$2, je<dhs> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public czd a(deq $$0, jg.a $$1) {
      return a($$1, $$0.d(), $$0.e(), this.f);
   }

   public static czd a(jg.a $$0, czd $$1, czd $$2, je<dhs> $$3) {
      Optional<je<dhq>> $$4 = dhr.a($$0, $$2);
      if ($$4.isPresent()) {
         dho $$5 = $$1.a(kj.W);
         dho $$6 = new dho($$4.get(), $$3);
         if (Objects.equals($$5, $$6)) {
            return czd.k;
         } else {
            czd $$7 = $$1.c(1);
            $$7.b(kj.W, $$6);
            return $$7;
         }
      } else {
         return czd.k;
      }
   }

   @Override
   public Optional<ddq> c() {
      return Optional.of(this.c);
   }

   @Override
   public ddq f() {
      return this.d;
   }

   @Override
   public Optional<ddq> k() {
      return Optional.of(this.e);
   }

   @Override
   public dee<des> a() {
      return dee.u;
   }

   @Override
   public ddt al_() {
      if (this.g == null) {
         this.g = ddt.b(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<dfa> g() {
      dfg $$0 = this.d.c();
      dfg $$1 = this.e.c();
      dfg $$2 = this.c.c();
      return List.of(new dfj($$2, $$0, $$1, new dfg.g($$0, $$1, this.f), new dfg.d(czh.xB)));
   }

   public static class a implements dee<des> {
      private static final MapCodec<des> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddq.d.fieldOf("template").forGetter($$0x -> $$0x.c),
                  ddq.d.fieldOf("base").forGetter($$0x -> $$0x.d),
                  ddq.d.fieldOf("addition").forGetter($$0x -> $$0x.e),
                  dhs.c.fieldOf("pattern").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, des::new)
      );
      public static final yw<wj, des> w = yw.a(ddq.a, $$0 -> $$0.c, ddq.a, $$0 -> $$0.d, ddq.a, $$0 -> $$0.e, dhs.d, $$0 -> $$0.f, des::new);

      @Override
      public MapCodec<des> a() {
         return x;
      }

      @Override
      public yw<wj, des> b() {
         return w;
      }
   }
}
