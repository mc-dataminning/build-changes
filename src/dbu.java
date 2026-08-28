import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbu implements dbr {
   final Optional<daw> a;
   final Optional<daw> b;
   final Optional<daw> c;
   @Nullable
   private daz d;

   public dbu(Optional<daw> $$0, Optional<daw> $$1, Optional<daw> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cwm a(dbs $$0, js.a $$1) {
      cwm $$2 = $$0.d();
      if (daw.a(this.b, $$2)) {
         Optional<jq.c<deb>> $$3 = dec.a($$1, $$0.e());
         Optional<jq.c<ded>> $$4 = dee.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            dea $$5 = $$2.a(ku.U);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cwm.k;
            }

            cwm $$6 = $$2.c(1);
            $$6.b(ku.U, new dea($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cwm.k;
   }

   @Override
   public cwm a(js.a $$0) {
      cwm $$1 = new cwm(cwq.pI);
      Optional<jq.c<ded>> $$2 = $$0.d(ma.aY).c().findFirst();
      Optional<jq.c<deb>> $$3 = $$0.d(ma.aX).a(dec.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(ku.U, new dea($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cwm $$0) {
      return daw.a(this.a, $$0);
   }

   @Override
   public boolean b(cwm $$0) {
      return daw.a(this.b, $$0);
   }

   @Override
   public boolean c(cwm $$0) {
      return daw.a(this.c, $$0);
   }

   @Override
   public dbf<?> ap_() {
      return dbf.u;
   }

   @Override
   public daz a() {
      if (this.d == null) {
         this.d = daz.a(List.of(this.a, this.b, this.c));
      }

      return this.d;
   }

   public static class a implements dbf<dbu> {
      private static final MapCodec<dbu> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  daw.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  daw.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  daw.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, dbu::new)
      );
      public static final zh<wu, dbu> w = zh.a(daw.b, $$0 -> $$0.a, daw.b, $$0 -> $$0.b, daw.b, $$0 -> $$0.c, dbu::new);

      @Override
      public MapCodec<dbu> a() {
         return x;
      }

      @Override
      public zh<wu, dbu> b() {
         return w;
      }
   }
}
