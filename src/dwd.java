import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dwd extends dwk {
   public static final Codec<dwd> a = Codec.unit(() -> dwd.b);
   public static final dwd b = new dwd();

   private dwd() {
      super(dwm.a.a);
   }

   @Override
   public ib a(dyx $$0, czc $$1) {
      return ib.g;
   }

   @Override
   public List<dyw.c> a(dyx $$0, gw $$1, czc $$2, arx $$3) {
      return Collections.emptyList();
   }

   @Override
   public duv a(dyx $$0, gw $$1, czc $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dyx $$0, cqk $$1, cqi $$2, dhb $$3, gw $$4, gw $$5, czc $$6, duv $$7, arx $$8, boolean $$9) {
      return true;
   }

   @Override
   public dwl<?> a() {
      return dwl.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
