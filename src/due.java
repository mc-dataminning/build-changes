import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class due extends dmq {
   public static final MapCodec<due> a = b(due::new);
   public static final ebx b = ebw.c;
   private final bty c = btv.a(5);

   @Override
   public MapCodec<due> a() {
      return a;
   }

   public due(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0.C ? null : a($$2, dyg.L, dzo::a);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, daa $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
