import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;

public record fjn(SourceFactor h, DestFactor i, SourceFactor j, DestFactor k) {
   public static final fjn a = new fjn(SourceFactor.SRC_ALPHA, DestFactor.ONE);
   public static final fjn b = new fjn(SourceFactor.SRC_COLOR, DestFactor.ONE, SourceFactor.ZERO, DestFactor.ONE);
   public static final fjn c = new fjn(SourceFactor.SRC_ALPHA, DestFactor.ONE, SourceFactor.ONE, DestFactor.ZERO);
   public static final fjn d = new fjn(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ONE_MINUS_SRC_ALPHA);
   public static final fjn e = new fjn(SourceFactor.ONE, DestFactor.ONE);
   public static final fjn f = new fjn(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
   public static final fjn g = new fjn(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ZERO, DestFactor.ONE);

   public fjn(SourceFactor $$0, DestFactor $$1) {
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
