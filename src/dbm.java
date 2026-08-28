import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbm implements dbk {
   final Optional<dap> a;
   final Optional<dap> b;
   final Optional<dap> c;
   final cwf d;
   @Nullable
   private das e;

   public dbm(Optional<dap> $$0, Optional<dap> $$1, Optional<dap> $$2, cwf $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cwf a(dbl $$0, js.a $$1) {
      cwf $$2 = $$0.d().a(this.d.h(), this.d.L());
      $$2.b(this.d.e());
      return $$2;
   }

   @Override
   public cwf a(js.a $$0) {
      return this.d;
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
      return day.t;
   }

   @Override
   public das a() {
      if (this.e == null) {
         this.e = das.a(List.of(this.a, this.b, this.c));
      }

      return this.e;
   }

   public static class a implements day<dbm> {
      private static final MapCodec<dbm> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dap.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  dap.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  dap.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c),
                  cwf.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dbm::new)
      );
      public static final zj<ww, dbm> w = zj.a(dap.b, $$0 -> $$0.a, dap.b, $$0 -> $$0.b, dap.b, $$0 -> $$0.c, cwf.i, $$0 -> $$0.d, dbm::new);

      @Override
      public MapCodec<dbm> a() {
         return x;
      }

      @Override
      public zj<ww, dbm> b() {
         return w;
      }
   }
}
