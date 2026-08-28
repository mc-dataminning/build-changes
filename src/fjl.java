import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;

public record fjl(SourceFactor h, DestFactor i, SourceFactor j, DestFactor k) {
   public static final fjl a = new fjl(SourceFactor.SRC_ALPHA, DestFactor.ONE);
   public static final fjl b = new fjl(SourceFactor.SRC_COLOR, DestFactor.ONE, SourceFactor.ZERO, DestFactor.ONE);
   public static final fjl c = new fjl(SourceFactor.SRC_ALPHA, DestFactor.ONE, SourceFactor.ONE, DestFactor.ZERO);
   public static final fjl d = new fjl(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ONE_MINUS_SRC_ALPHA);
   public static final fjl e = new fjl(SourceFactor.ONE, DestFactor.ONE);
   public static final fjl f = new fjl(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
   public static final fjl g = new fjl(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ZERO, DestFactor.ONE);

   public fjl(SourceFactor $$0, DestFactor $$1) {
      this($$0, $$1, $$0, $$1);
   }

   public SourceFactor a() {
      return this.h;
   }

   public DestFactor b() {
      return this.i;
   }

   public SourceFactor c() {
      return this.j;
   }

   public DestFactor d() {
      return this.k;
   }
}
