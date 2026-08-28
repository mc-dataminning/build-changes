import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbn implements dbk {
   final Optional<dap> a;
   final Optional<dap> b;
   final Optional<dap> c;
   @Nullable
   private das d;

   public dbn(Optional<dap> $$0, Optional<dap> $$1, Optional<dap> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cwf a(dbl $$0, js.a $$1) {
      cwf $$2 = $$0.d();
      if (dap.a(this.b, $$2)) {
         Optional<jq.c<ddu>> $$3 = ddv.a($$1, $$0.e());
         Optional<jq.c<ddw>> $$4 = ddx.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            ddt $$5 = $$2.a(ku.U);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cwf.k;
            }

            cwf $$6 = $$2.c(1);
            $$6.b(ku.U, new ddt($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cwf.k;
   }

   @Override
   public cwf a(js.a $$0) {
      cwf $$1 = new cwf(cwj.pI);
      Optional<jq.c<ddw>> $$2 = $$0.d(ma.aY).c().findFirst();
      Optional<jq.c<ddu>> $$3 = $$0.d(ma.aX).a(ddv.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(ku.U, new ddt($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cwf $$0) {
      return dap.a(this.a, $$0);
   }

   @Override
   public boolean b(cwf $$0) {
      return dap.a(this.b, $$0);
   }

   @Override
   public boolean c(cwf $$0) {
      return dap.a(this.c, $$0);
   }

   @Override
   public day<?> aq_() {
      return day.u;
   }

   @Override
   public das a() {
      if (this.d == null) {
         this.d = das.a(List.of(this.a, this.b, this.c));
      }

      return this.d;
   }

   public static class a implements day<dbn> {
      private static final MapCodec<dbn> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dap.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  dap.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  dap.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, dbn::new)
      );
      public static final zj<ww, dbn> w = zj.a(dap.b, $$0 -> $$0.a, dap.b, $$0 -> $$0.b, dap.b, $$0 -> $$0.c, dbn::new);

      @Override
      public MapCodec<dbn> a() {
         return x;
      }

      @Override
      public zj<ww, dbn> b() {
         return w;
      }
   }
}
