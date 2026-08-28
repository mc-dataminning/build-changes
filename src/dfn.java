import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfn implements dfk {
   final del d;
   final del e;
   final del f;
   final jf<din> g;
   @Nullable
   private deo h;

   public dfn(del $$0, del $$1, del $$2, jf<din> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public czy a(dfl $$0, jh.a $$1) {
      return a($$1, $$0.d(), $$0.e(), this.g);
   }

   public static czy a(jh.a $$0, czy $$1, czy $$2, jf<din> $$3) {
      Optional<jf<dil>> $$4 = dim.a($$0, $$2);
      if ($$4.isPresent()) {
         dij $$5 = $$1.a(kk.W);
         dij $$6 = new dij($$4.get(), $$3);
         if (Objects.equals($$5, $$6)) {
            return czy.k;
         } else {
            czy $$7 = $$1.c(1);
            $$7.b(kk.W, $$6);
            return $$7;
         }
      } else {
         return czy.k;
      }
   }

   @Override
   public Optional<del> c() {
      return Optional.of(this.d);
   }

   @Override
   public del f() {
      return this.e;
   }

   @Override
   public Optional<del> k() {
      return Optional.of(this.f);
   }

   @Override
   public dez<dfn> a() {
      return dez.u;
   }

   @Override
   public deo ap_() {
      if (this.h == null) {
         this.h = deo.b(List.of(this.d, this.e, this.f));
      }

      return this.h;
   }

   @Override
   public List<dfv> g() {
      dgb $$0 = this.e.c();
      dgb $$1 = this.f.c();
      dgb $$2 = this.d.c();
      return List.of(new dge($$2, $$0, $$1, new dgb.g($$0, $$1, this.g), new dgb.d(dac.xB)));
   }

   public static class a implements dez<dfn> {
      private static final MapCodec<dfn> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  del.d.fieldOf("template").forGetter($$0x -> $$0x.d),
                  del.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  del.d.fieldOf("addition").forGetter($$0x -> $$0x.f),
                  din.c.fieldOf("pattern").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfn::new)
      );
      public static final yy<wl, dfn> w = yy.a(del.a, $$0 -> $$0.d, del.a, $$0 -> $$0.e, del.a, $$0 -> $$0.f, din.d, $$0 -> $$0.g, dfn::new);

      @Override
      public MapCodec<dfn> a() {
         return x;
      }

      @Override
      public yy<wl, dfn> b() {
         return w;
      }
   }
}
