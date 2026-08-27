import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dzc extends dzq {
   public static final Codec<dzc> a = Codec.unit(() -> dzc.b);
   public static final dzc b = new dzc();

   @Nullable
   @Override
   public dzt.c a(crc $$0, ht $$1, ht $$2, dzt.c $$3, dzt.c $$4, dzp $$5) {
      ht $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cuc.H);
      return $$7 && !cua.a($$4.b().j($$0, $$6)) ? new dzt.c($$6, cuc.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected dzs<?> a() {
      return dzs.m;
   }
}
