import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fhk {
   private static final int a = -1;
   private final js<fhj> b = new js<>(32);
   private final Map<dfw, Set<dud<?>>> c = Maps.newHashMap();

   public static fhk a() {
      fhk $$0 = new fhk();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gef.a($$1, $$0x.c(die.b) == dtw.a ? $$2.d() : $$2) : dcs.a(), dfy.iI, dfy.iH);
      $$0.a(die.b, dfy.iI, dfy.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gef.a($$1, $$2) : dcs.a(), dfy.i, dfy.bu, dfy.bt, dfy.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gef.a($$1, $$2) : dcs.a();
         } else {
            return -1;
         }
      }, dfy.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> dco.a(), dfy.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> dco.b(), dfy.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gef.b($$1, $$2) : dco.c(), dfy.aE, dfy.aH, dfy.aI, dfy.aK, dfy.ff, dfy.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gef.c($$1, $$2) : -1, dfy.G, dfy.nd, dfy.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dlz.b($$0x.c(dlz.f)), dfy.cw);
      $$0.a(dlz.f, dfy.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gef.a($$1, $$2) : -1, dfy.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dfy.fc, dfy.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dnt.c);
         return axx.b.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dfy.fe, dfy.fd);
      $$0.a(dnt.c, dfy.fe, dfy.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dfy.fm);
      return $$0;
   }

   public int a(dta $$0, dcu $$1, jd $$2) {
      fhj $$3 = this.b.a(lt.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         epc $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dta $$0, @Nullable dbx $$1, @Nullable jd $$2, int $$3) {
      fhj $$4 = this.b.a(lt.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fhj $$0, dfw... $$1) {
      for (dfw $$2 : $$1) {
         this.b.a($$0, lt.e.a($$2));
      }
   }

   private void a(Set<dud<?>> $$0, dfw... $$1) {
      for (dfw $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(dud<?> $$0, dfw... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<dud<?>> a(dfw $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
