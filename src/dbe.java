import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbe implements dbb {
   final Optional<daf> a;
   final Optional<daf> b;
   final Optional<daf> c;
   @Nullable
   private dai d;

   public dbe(Optional<daf> $$0, Optional<daf> $$1, Optional<daf> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cvx a(dbc $$0, jr.a $$1) {
      cvx $$2 = $$0.d();
      if (daf.a(this.b, $$2)) {
         Optional<jp.c<ddk>> $$3 = ddl.a($$1, $$0.e());
         Optional<jp.c<ddm>> $$4 = ddn.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            ddj $$5 = $$2.a(kt.T);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cvx.k;
            }

            cvx $$6 = $$2.c(1);
            $$6.b(kt.T, new ddj($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cvx.k;
   }

   @Override
   public cvx a(jr.a $$0) {
      cvx $$1 = new cvx(cwb.pI);
      Optional<jp.c<ddm>> $$2 = $$0.d(ly.aY).c().findFirst();
      Optional<jp.c<ddk>> $$3 = $$0.d(ly.aX).a(ddl.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kt.T, new ddj($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cvx $$0) {
      return daf.a(this.a, $$0);
   }

   @Override
   public boolean b(cvx $$0) {
      return daf.a(this.b, $$0);
   }

   @Override
   public boolean c(cvx $$0) {
      return daf.a(this.c, $$0);
   }

   @Override
   public dao<?> ar_() {
      return dao.u;
   }

   @Override
   public dai a() {
      if (this.d == null) {
         this.d = dai.a(List.of(this.a, this.b, this.c));
      }

      return this.d;
   }

   public static class a implements dao<dbe> {
      private static final MapCodec<dbe> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  daf.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  daf.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  daf.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, dbe::new)
      );
      public static final zf<ws, dbe> w = zf.a(daf.b, $$0 -> $$0.a, daf.b, $$0 -> $$0.b, daf.b, $$0 -> $$0.c, dbe::new);

      @Override
      public MapCodec<dbe> a() {
         return x;
      }

      @Override
      public zf<ws, dbe> b() {
         return w;
      }
   }
}
