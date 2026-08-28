import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfp implements dfm {
   final den d;
   final den e;
   final den f;
   final jg<dip> g;
   @Nullable
   private deq h;

   public dfp(den $$0, den $$1, den $$2, jg<dip> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public daa a(dfn $$0, ji.a $$1) {
      return a($$1, $$0.d(), $$0.e(), this.g);
   }

   public static daa a(ji.a $$0, daa $$1, daa $$2, jg<dip> $$3) {
      Optional<jg<din>> $$4 = dio.a($$0, $$2);
      if ($$4.isPresent()) {
         dil $$5 = $$1.a(kl.W);
         dil $$6 = new dil($$4.get(), $$3);
         if (Objects.equals($$5, $$6)) {
            return daa.k;
         } else {
            daa $$7 = $$1.c(1);
            $$7.b(kl.W, $$6);
            return $$7;
         }
      } else {
         return daa.k;
      }
   }

   @Override
   public Optional<den> c() {
      return Optional.of(this.d);
   }

   @Override
   public den f() {
      return this.e;
   }

   @Override
   public Optional<den> k() {
      return Optional.of(this.f);
   }

   @Override
   public dfb<dfp> a() {
      return dfb.u;
   }

   @Override
   public deq ap_() {
      if (this.h == null) {
         this.h = deq.b(List.of(this.d, this.e, this.f));
      }

      return this.h;
   }

   @Override
   public List<dfx> g() {
      dgd $$0 = this.e.c();
      dgd $$1 = this.f.c();
      dgd $$2 = this.d.c();
      return List.of(new dgg($$2, $$0, $$1, new dgd.g($$0, $$1, this.g), new dgd.d(dae.xB)));
   }

   public static class a implements dfb<dfp> {
      private static final MapCodec<dfp> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  den.d.fieldOf("template").forGetter($$0x -> $$0x.d),
                  den.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  den.d.fieldOf("addition").forGetter($$0x -> $$0x.f),
                  dip.c.fieldOf("pattern").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfp::new)
      );
      public static final za<wn, dfp> w = za.a(den.a, $$0 -> $$0.d, den.a, $$0 -> $$0.e, den.a, $$0 -> $$0.f, dip.d, $$0 -> $$0.g, dfp::new);

      @Override
      public MapCodec<dfp> a() {
         return x;
      }

      @Override
      public za<wn, dfp> b() {
         return w;
      }
   }
}
