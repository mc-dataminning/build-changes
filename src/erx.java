import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record erx(List<erm> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alg c = alg.b("jigsaw");
   private static final Map<alg, alg> d = ImmutableMap.builder()
      .put(alg.b("nvi"), c)
      .put(alg.b("pcp"), c)
      .put(alg.b("bastionremnant"), c)
      .put(alg.b("runtime"), c)
      .build();

   public erx(final List<erm> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(iv $$0) {
      for (erm $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public uw a(ery $$0) {
      uf $$1 = new uf();

      for (erm $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static erx a(uf $$0, ery $$1) {
      List<erm> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tz $$4 = $$0.a($$3);
         String $$5 = $$4.j("id").toLowerCase(Locale.ROOT);
         alg $$6 = alg.a($$5);
         alg $$7 = d.getOrDefault($$6, $$6);
         erz $$8 = mg.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               erm $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new erx($$2);
   }

   public era b() {
      return erm.a(this.a.stream());
   }

   public List<erm> c() {
      return this.a;
   }
}
