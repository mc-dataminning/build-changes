import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bke {
   private static final Logger a = LogUtils.getLogger();
   private final Map<bkc, bkd> b = Maps.newHashMap();
   private final Set<bkd> c = Sets.newHashSet();
   private final bkg d;

   public bke(bkg $$0) {
      this.d = $$0;
   }

   private void a(bkd $$0) {
      if ($$0.a().b()) {
         this.c.add($$0);
      }
   }

   public Set<bkd> a() {
      return this.c;
   }

   public Collection<bkd> b() {
      return this.b.values().stream().filter($$0 -> $$0.a().b()).collect(Collectors.toList());
   }

   @Nullable
   public bkd a(bkc $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   @Nullable
   public bkd a(hg<bkc> $$0) {
      return this.a($$0.a());
   }

   public boolean b(bkc $$0) {
      return this.b.get($$0) != null || this.d.c($$0);
   }

   public boolean b(hg<bkc> $$0) {
      return this.b($$0.a());
   }

   public boolean a(bkc $$0, UUID $$1) {
      bkd $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public boolean a(hg<bkc> $$0, UUID $$1) {
      return this.a($$0.a(), $$1);
   }

   public double c(bkc $$0) {
      bkd $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.d.a($$0);
   }

   public double d(bkc $$0) {
      bkd $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(bkc $$0, UUID $$1) {
      bkd $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).d() : this.d.a($$0, $$1);
   }

   public double b(hg<bkc> $$0, UUID $$1) {
      return this.b($$0.a(), $$1);
   }

   public void a(Multimap<bkc, bkf> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         bkd $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.b($$1x.a()));
         }
      });
   }

   public void b(Multimap<bkc, bkf> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         bkd $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.b($$1.a());
            $$2.b($$1);
         }
      });
   }

   public void a(bke $$0) {
      $$0.b.values().forEach($$0x -> {
         bkd $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public ra c() {
      ra $$0 = new ra();

      for (bkd $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(ra $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qu $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         ac.a(jd.v.b(aeu.a($$3)), $$1x -> {
            bkd $$2x = this.a($$1x);
            if ($$2x != null) {
               $$2x.a($$2);
            }
         }, () -> a.warn("Ignoring unknown attribute '{}'", $$3));
      }
   }
}
