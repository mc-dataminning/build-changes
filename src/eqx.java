import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eqx(List<eqm> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ale c = ale.b("jigsaw");
   private static final Map<ale, ale> d = ImmutableMap.builder()
      .put(ale.b("nvi"), c)
      .put(ale.b("pcp"), c)
      .put(ale.b("bastionremnant"), c)
      .put(ale.b("runtime"), c)
      .build();

   public eqx(final List<eqm> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(iu $$0) {
      for (eqm $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public uu a(eqy $$0) {
      ud $$1 = new ud();

      for (eqm $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eqx a(ud $$0, eqy $$1) {
      List<eqm> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tx $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ale $$6 = ale.a($$5);
         ale $$7 = d.getOrDefault($$6, $$6);
         eqz $$8 = mf.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eqm $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eqx($$2);
   }

   public eqa b() {
      return eqm.a(this.a.stream());
   }

   public List<eqm> c() {
      return this.a;
   }
}
