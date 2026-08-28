import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbd implements dbb {
   final Optional<daf> a;
   final Optional<daf> b;
   final Optional<daf> c;
   final cvx d;
   @Nullable
   private dai e;

   public dbd(Optional<daf> $$0, Optional<daf> $$1, Optional<daf> $$2, cvx $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cvx a(dbc $$0, jr.a $$1) {
      cvx $$2 = $$0.d().a(this.d.h(), this.d.L());
      $$2.b(this.d.e());
      return $$2;
   }

   @Override
   public cvx a(jr.a $$0) {
      return this.d;
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
      return dao.t;
   }

   @Override
   public dai a() {
      if (this.e == null) {
         this.e = dai.a(List.of(this.a, this.b, this.c));
      }

      return this.e;
   }

   public static class a implements dao<dbd> {
      private static final MapCodec<dbd> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  daf.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  daf.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  daf.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c),
                  cvx.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dbd::new)
      );
      public static final zf<ws, dbd> w = zf.a(daf.b, $$0 -> $$0.a, daf.b, $$0 -> $$0.b, daf.b, $$0 -> $$0.c, cvx.i, $$0 -> $$0.d, dbd::new);

      @Override
      public MapCodec<dbd> a() {
         return x;
      }

      @Override
      public zf<ws, dbd> b() {
         return w;
      }
   }
}
