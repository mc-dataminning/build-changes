import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfz implements dfw {
   final dex d;
   final dex e;
   final dex f;
   final jg<diz> g;
   @Nullable
   private dfa h;

   public dfz(dex $$0, dex $$1, dex $$2, jg<diz> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public dak a(dfx $$0, ji.a $$1) {
      return a($$1, $$0.d(), $$0.e(), this.g);
   }

   public static dak a(ji.a $$0, dak $$1, dak $$2, jg<diz> $$3) {
      Optional<jg<dix>> $$4 = diy.a($$0, $$2);
      if ($$4.isPresent()) {
         div $$5 = $$1.a(kl.W);
         div $$6 = new div($$4.get(), $$3);
         if (Objects.equals($$5, $$6)) {
            return dak.l;
         } else {
            dak $$7 = $$1.c(1);
            $$7.b(kl.W, $$6);
            return $$7;
         }
      } else {
         return dak.l;
      }
   }

   @Override
   public Optional<dex> c() {
      return Optional.of(this.d);
   }

   @Override
   public dex f() {
      return this.e;
   }

   @Override
   public Optional<dex> k() {
      return Optional.of(this.f);
   }

   @Override
   public dfl<dfz> a() {
      return dfl.u;
   }

   @Override
   public dfa aq_() {
      if (this.h == null) {
         this.h = dfa.b(List.of(this.d, this.e, this.f));
      }

      return this.h;
   }

   @Override
   public List<dgh> g() {
      dgn $$0 = this.e.c();
      dgn $$1 = this.f.c();
      dgn $$2 = this.d.c();
      return List.of(new dgq($$2, $$0, $$1, new dgn.g($$0, $$1, this.g), new dgn.d(dao.xB)));
   }

   public static class a implements dfl<dfz> {
      private static final MapCodec<dfz> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dex.d.fieldOf("template").forGetter($$0x -> $$0x.d),
                  dex.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  dex.d.fieldOf("addition").forGetter($$0x -> $$0x.f),
                  diz.c.fieldOf("pattern").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfz::new)
      );
      public static final ze<wp, dfz> w = ze.a(dex.a, $$0 -> $$0.d, dex.a, $$0 -> $$0.e, dex.a, $$0 -> $$0.f, diz.d, $$0 -> $$0.g, dfz::new);

      @Override
      public MapCodec<dfz> a() {
         return x;
      }

      @Override
      public ze<wp, dfz> b() {
         return w;
      }
   }
}
