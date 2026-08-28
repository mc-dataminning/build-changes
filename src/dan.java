import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dan implements dal {
   final Optional<czp> a;
   final Optional<czp> b;
   final Optional<czp> c;
   final cvl d;
   @Nullable
   private czs e;

   public dan(Optional<czp> $$0, Optional<czp> $$1, Optional<czp> $$2, cvl $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cvl a(dam $$0, jp.a $$1) {
      cvl $$2 = $$0.d().a(this.d.h(), this.d.J());
      $$2.b(this.d.e());
      return $$2;
   }

   @Override
   public cvl a(jp.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cvl $$0) {
      return czp.a(this.a, $$0);
   }

   @Override
   public boolean b(cvl $$0) {
      return czp.a(this.b, $$0);
   }

   @Override
   public boolean c(cvl $$0) {
      return czp.a(this.c, $$0);
   }

   @Override
   public czy<?> as_() {
      return czy.t;
   }

   @Override
   public czs a() {
      if (this.e == null) {
         this.e = czs.a(List.of(this.a, this.b, this.c));
      }

      return this.e;
   }

   public static class a implements czy<dan> {
      private static final MapCodec<dan> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  czp.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  czp.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  czp.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c),
                  cvl.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dan::new)
      );
      public static final zb<wo, dan> w = zb.a(czp.b, $$0 -> $$0.a, czp.b, $$0 -> $$0.b, czp.b, $$0 -> $$0.c, cvl.i, $$0 -> $$0.d, dan::new);

      @Override
      public MapCodec<dan> a() {
         return x;
      }

      @Override
      public zb<wo, dan> b() {
         return w;
      }
   }
}
