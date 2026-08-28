import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbe implements dbc {
   final Optional<dag> a;
   final Optional<dag> b;
   final Optional<dag> c;
   final cvs d;
   @Nullable
   private daj e;

   public dbe(Optional<dag> $$0, Optional<dag> $$1, Optional<dag> $$2, cvs $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cvs a(dbd $$0, jq.a $$1) {
      cvs $$2 = $$0.d().a(this.d.h(), this.d.K());
      $$2.b(this.d.e());
      return $$2;
   }

   @Override
   public cvs a(jq.a $$0) {
      return this.d;
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
      return dap.t;
   }

   @Override
   public daj a() {
      if (this.e == null) {
         this.e = daj.a(List.of(this.a, this.b, this.c));
      }

      return this.e;
   }

   public static class a implements dap<dbe> {
      private static final MapCodec<dbe> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dag.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  dag.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  dag.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c),
                  cvs.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dbe::new)
      );
      public static final zc<wp, dbe> w = zc.a(dag.b, $$0 -> $$0.a, dag.b, $$0 -> $$0.b, dag.b, $$0 -> $$0.c, cvs.i, $$0 -> $$0.d, dbe::new);

      @Override
      public MapCodec<dbe> a() {
         return x;
      }

      @Override
      public zc<wp, dbe> b() {
         return w;
      }
   }
}
