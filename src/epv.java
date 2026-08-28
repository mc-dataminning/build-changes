import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record epv(List<epk> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ald c = ald.b("jigsaw");
   private static final Map<ald, ald> d = ImmutableMap.builder()
      .put(ald.b("nvi"), c)
      .put(ald.b("pcp"), c)
      .put(ald.b("bastionremnant"), c)
      .put(ald.b("runtime"), c)
      .build();

   public epv(final List<epk> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jj $$0) {
      for (epk $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public ut a(epw $$0) {
      uc $$1 = new uc();

      for (epk $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static epv a(uc $$0, epw $$1) {
      List<epk> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tw $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ald $$6 = ald.a($$5);
         ald $$7 = d.getOrDefault($$6, $$6);
         epx $$8 = md.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               epk $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new epv($$2);
   }

   public eoy b() {
      return epk.a(this.a.stream());
   }

   public List<epk> c() {
      return this.a;
   }
}
