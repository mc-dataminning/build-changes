import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eoz(List<eoo> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alz c = alz.b("jigsaw");
   private static final Map<alz, alz> d = ImmutableMap.builder()
      .put(alz.b("nvi"), c)
      .put(alz.b("pcp"), c)
      .put(alz.b("bastionremnant"), c)
      .put(alz.b("runtime"), c)
      .build();

   public eoz(final List<eoo> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jh $$0) {
      for (eoo $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vu a(epa $$0) {
      vd $$1 = new vd();

      for (eoo $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eoz a(vd $$0, epa $$1) {
      List<eoo> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ux $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         alz $$6 = alz.a($$5);
         alz $$7 = d.getOrDefault($$6, $$6);
         epb $$8 = ma.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eoo $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eoz($$2);
   }

   public eoc b() {
      return eoo.a(this.a.stream());
   }

   public List<eoo> c() {
      return this.a;
   }
}
