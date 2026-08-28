import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fkk {
   private static final int a = -1;
   private final jw<fkj> b = new jw<>(32);
   private final Map<die, Set<dwm<?>>> c = Maps.newHashMap();

   public static fkk a() {
      fkk $$0 = new fkk();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghn.a($$1, $$0x.c(dkm.b) == dwf.a ? $$2.e() : $$2) : dez.a(), dig.iI, dig.iH);
      $$0.a(dkm.b, dig.iI, dig.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghn.a($$1, $$2) : dez.a(), dig.i, dig.bu, dig.bt, dig.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? ghn.a($$1, $$2) : dez.a();
         } else {
            return -1;
         }
      }, dig.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dev.a(), dig.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dev.b(), dig.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghn.b($$1, $$2) : dev.c(), dig.aE, dig.aH, dig.aI, dig.aK, dig.ff, dig.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghn.c($$1, $$2) : -1, dig.G, dig.nd, dig.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dog.b($$0x.c(dog.f)), dig.cw);
      $$0.a(dog.f, dig.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? ghn.a($$1, $$2) : -1, dig.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dig.fc, dig.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dqa.c);
         return axv.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dig.fe, dig.fd);
      $$0.a(dqa.c, dig.fe, dig.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dig.fm);
      return $$0;
   }

   public int a(dvj $$0, dfb $$1, jh $$2) {
      fkj $$3 = this.b.a(ly.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         ero $$4 = $$0.a((deg)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dvj $$0, @Nullable ded $$1, @Nullable jh $$2, int $$3) {
      fkj $$4 = this.b.a(ly.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fkj $$0, die... $$1) {
      for (die $$2 : $$1) {
         this.b.a($$0, ly.e.a($$2));
      }
   }

   private void a(Set<dwm<?>> $$0, die... $$1) {
      for (die $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dwm<?> $$0, die... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dwm<?>> a(die $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
