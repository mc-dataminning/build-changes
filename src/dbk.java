import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbk implements dbh {
   final Optional<dal> a;
   final Optional<dal> b;
   final Optional<dal> c;
   @Nullable
   private dao d;

   public dbk(Optional<dal> $$0, Optional<dal> $$1, Optional<dal> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cwb a(dbi $$0, js.a $$1) {
      cwb $$2 = $$0.d();
      if (dal.a(this.b, $$2)) {
         Optional<jq.c<ddq>> $$3 = ddr.a($$1, $$0.e());
         Optional<jq.c<dds>> $$4 = ddt.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            ddp $$5 = $$2.a(ku.U);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cwb.k;
            }

            cwb $$6 = $$2.c(1);
            $$6.b(ku.U, new ddp($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cwb.k;
   }

   @Override
   public cwb a(js.a $$0) {
      cwb $$1 = new cwb(cwf.pI);
      Optional<jq.c<dds>> $$2 = $$0.d(lz.aY).c().findFirst();
      Optional<jq.c<ddq>> $$3 = $$0.d(lz.aX).a(ddr.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(ku.U, new ddp($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cwb $$0) {
      return dal.a(this.a, $$0);
   }

   @Override
   public boolean b(cwb $$0) {
      return dal.a(this.b, $$0);
   }

   @Override
   public boolean c(cwb $$0) {
      return dal.a(this.c, $$0);
   }

   @Override
   public dau<?> aq_() {
      return dau.u;
   }

   @Override
   public dao a() {
      if (this.d == null) {
         this.d = dao.a(List.of(this.a, this.b, this.c));
      }

      return this.d;
   }

   public static class a implements dau<dbk> {
      private static final MapCodec<dbk> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dal.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  dal.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  dal.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, dbk::new)
      );
      public static final zg<wt, dbk> w = zg.a(dal.b, $$0 -> $$0.a, dal.b, $$0 -> $$0.b, dal.b, $$0 -> $$0.c, dbk::new);

      @Override
      public MapCodec<dbk> a() {
         return x;
      }

      @Override
      public zg<wt, dbk> b() {
         return w;
      }
   }
}
