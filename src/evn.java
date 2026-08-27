import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class evn {
   private static final int a = -1;
   private final il<evm> b = new il<>(32);
   private final Map<cvz, Set<djs<?>>> c = Maps.newHashMap();

   public static evn a() {
      evn $$0 = new evn();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fru.a($$1, $$0x.c(cyh.b) == djl.a ? $$2.d() : $$2) : csw.a(), cwb.iI, cwb.iH);
      $$0.a(cyh.b, cwb.iI, cwb.iH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fru.a($$1, $$2) : csw.a(), cwb.i, cwb.bu, cwb.bt, cwb.gb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? fru.a($$1, $$2) : csw.a();
         } else {
            return -1;
         }
      }, cwb.sB);
      $$0.a(($$0x, $$1, $$2, $$3) -> css.a(), cwb.aF);
      $$0.a(($$0x, $$1, $$2, $$3) -> css.b(), cwb.aG);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fru.b($$1, $$2) : css.c(), cwb.aE, cwb.aH, cwb.aI, cwb.aK, cwb.ff, cwb.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fru.c($$1, $$2) : -1, cwb.G, cwb.nd, cwb.fu);
      $$0.a(($$0x, $$1, $$2, $$3) -> dca.b($$0x.c(dca.f)), cwb.cw);
      $$0.a(dca.f, cwb.cw);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? fru.a($$1, $$2) : -1, cwb.dS);
      $$0.a(($$0x, $$1, $$2, $$3) -> 14731036, cwb.fc, cwb.fb);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(ddu.c);
         int $$5 = $$4 * 32;
         int $$6 = 255 - $$4 * 8;
         int $$7 = $$4 * 4;
         return $$5 << 16 | $$6 << 8 | $$7;
      }, cwb.fe, cwb.fd);
      $$0.a(ddu.c, cwb.fe, cwb.fd);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? 2129968 : 7455580, cwb.fm);
      return $$0;
   }

   public int a(dip $$0, csy $$1, hv $$2) {
      evm $$3 = this.b.a(kb.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         eed $$4 = $$0.d($$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(dip $$0, @Nullable csb $$1, @Nullable hv $$2, int $$3) {
      evm $$4 = this.b.a(kb.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(evm $$0, cvz... $$1) {
      for (cvz $$2 : $$1) {
         this.b.a($$0, kb.e.a($$2));
      }
   }

   private void a(Set<djs<?>> $$0, cvz... $$1) {
      for (cvz $$2 : $$1) {
         this.c.put($$2, $$0);
      }
   }

   private void a(djs<?> $$0, cvz... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<djs<?>> a(cvz $$0) {
      return this.c.getOrDefault($$0, ImmutableSet.of());
   }
}
