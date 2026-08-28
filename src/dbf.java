import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbf implements dbc {
   final Optional<dag> a;
   final Optional<dag> b;
   final Optional<dag> c;
   @Nullable
   private daj d;

   public dbf(Optional<dag> $$0, Optional<dag> $$1, Optional<dag> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cvs a(dbd $$0, jq.a $$1) {
      cvs $$2 = $$0.d();
      if (dag.a(this.b, $$2)) {
         Optional<jo.c<cxv>> $$3 = cxw.a($$1, $$0.e());
         Optional<jo.c<cxx>> $$4 = cxy.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            cxu $$5 = $$2.a(ks.P);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cvs.k;
            }

            cvs $$6 = $$2.c(1);
            $$6.b(ks.P, new cxu($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cvs.k;
   }

   @Override
   public cvs a(jq.a $$0) {
      cvs $$1 = new cvs(cvw.pI);
      Optional<jo.c<cxx>> $$2 = $$0.d(lw.aZ).c().findFirst();
      Optional<jo.c<cxv>> $$3 = $$0.d(lw.aY).a(cxw.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(ks.P, new cxu($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cvs $$0) {
      return dag.a(this.a, $$0);
   }

   @Override
   public boolean b(cvs $$0) {
      return dag.a(this.b, $$0);
   }

   @Override
   public boolean c(cvs $$0) {
      return dag.a(this.c, $$0);
   }

   @Override
   public dap<?> ar_() {
      return dap.u;
   }

   @Override
   public daj a() {
      if (this.d == null) {
         this.d = daj.a(List.of(this.a, this.b, this.c));
      }

      return this.d;
   }

   public static class a implements dap<dbf> {
      private static final MapCodec<dbf> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dag.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  dag.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  dag.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, dbf::new)
      );
      public static final zc<wp, dbf> w = zc.a(dag.b, $$0 -> $$0.a, dag.b, $$0 -> $$0.b, dag.b, $$0 -> $$0.c, dbf::new);

      @Override
      public MapCodec<dbf> a() {
         return x;
      }

      @Override
      public zc<wp, dbf> b() {
         return w;
      }
   }
}
