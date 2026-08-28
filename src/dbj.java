import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbj implements dbh {
   final Optional<dal> a;
   final Optional<dal> b;
   final Optional<dal> c;
   final cwb d;
   @Nullable
   private dao e;

   public dbj(Optional<dal> $$0, Optional<dal> $$1, Optional<dal> $$2, cwb $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cwb a(dbi $$0, js.a $$1) {
      cwb $$2 = $$0.d().a(this.d.h(), this.d.L());
      $$2.b(this.d.e());
      return $$2;
   }

   @Override
   public cwb a(js.a $$0) {
      return this.d;
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
      return dau.t;
   }

   @Override
   public dao a() {
      if (this.e == null) {
         this.e = dao.a(List.of(this.a, this.b, this.c));
      }

      return this.e;
   }

   public static class a implements dau<dbj> {
      private static final MapCodec<dbj> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dal.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  dal.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  dal.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c),
                  cwb.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dbj::new)
      );
      public static final zg<wt, dbj> w = zg.a(dal.b, $$0 -> $$0.a, dal.b, $$0 -> $$0.b, dal.b, $$0 -> $$0.c, cwb.i, $$0 -> $$0.d, dbj::new);

      @Override
      public MapCodec<dbj> a() {
         return x;
      }

      @Override
      public zg<wt, dbj> b() {
         return w;
      }
   }
}
