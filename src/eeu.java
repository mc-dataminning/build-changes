import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eeu extends efi {
   public static final Codec<eeu> a = Codec.unit(() -> eeu.b);
   public static final eeu b = new eeu();

   @Nullable
   @Override
   public efl.c a(cvu $$0, hz $$1, hz $$2, efl.c $$3, efl.c $$4, efh $$5) {
      hz $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cyu.H);
      return $$7 && !cys.a($$4.b().j($$0, $$6)) ? new efl.c($$6, cyu.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected efk<?> a() {
      return efk.m;
   }
}
