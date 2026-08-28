import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfc implements dez {
   final dea d;
   final dea e;
   final dea f;
   final jf<dic> g;
   @Nullable
   private ded h;

   public dfc(dea $$0, dea $$1, dea $$2, jf<dic> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public czn a(dfa $$0, jh.a $$1) {
      return a($$1, $$0.d(), $$0.e(), this.g);
   }

   public static czn a(jh.a $$0, czn $$1, czn $$2, jf<dic> $$3) {
      Optional<jf<dia>> $$4 = dib.a($$0, $$2);
      if ($$4.isPresent()) {
         dhy $$5 = $$1.a(kk.W);
         dhy $$6 = new dhy($$4.get(), $$3);
         if (Objects.equals($$5, $$6)) {
            return czn.k;
         } else {
            czn $$7 = $$1.c(1);
            $$7.b(kk.W, $$6);
            return $$7;
         }
      } else {
         return czn.k;
      }
   }

   @Override
   public Optional<dea> c() {
      return Optional.of(this.d);
   }

   @Override
   public dea f() {
      return this.e;
   }

   @Override
   public Optional<dea> k() {
      return Optional.of(this.f);
   }

   @Override
   public deo<dfc> a() {
      return deo.u;
   }

   @Override
   public ded al_() {
      if (this.h == null) {
         this.h = ded.b(List.of(this.d, this.e, this.f));
      }

      return this.h;
   }

   @Override
   public List<dfk> g() {
      dfq $$0 = this.e.c();
      dfq $$1 = this.f.c();
      dfq $$2 = this.d.c();
      return List.of(new dft($$2, $$0, $$1, new dfq.g($$0, $$1, this.g), new dfq.d(czr.xB)));
   }

   public static class a implements deo<dfc> {
      private static final MapCodec<dfc> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dea.d.fieldOf("template").forGetter($$0x -> $$0x.d),
                  dea.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  dea.d.fieldOf("addition").forGetter($$0x -> $$0x.f),
                  dic.c.fieldOf("pattern").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfc::new)
      );
      public static final yw<wj, dfc> w = yw.a(dea.a, $$0 -> $$0.d, dea.a, $$0 -> $$0.e, dea.a, $$0 -> $$0.f, dic.d, $$0 -> $$0.g, dfc::new);

      @Override
      public MapCodec<dfc> a() {
         return x;
      }

      @Override
      public yw<wj, dfc> b() {
         return w;
      }
   }
}
