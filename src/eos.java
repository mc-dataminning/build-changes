import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eos(List<eoh> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alp c = alp.b("jigsaw");
   private static final Map<alp, alp> d = ImmutableMap.builder()
      .put(alp.b("nvi"), c)
      .put(alp.b("pcp"), c)
      .put(alp.b("bastionremnant"), c)
      .put(alp.b("runtime"), c)
      .build();

   public eos(final List<eoh> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jh $$0) {
      for (eoh $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vj a(eot $$0) {
      us $$1 = new us();

      for (eoh $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eos a(us $$0, eot $$1) {
      List<eoh> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         um $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         alp $$6 = alp.a($$5);
         alp $$7 = d.getOrDefault($$6, $$6);
         eou $$8 = ma.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eoh $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eos($$2);
   }

   public env b() {
      return eoh.a(this.a.stream());
   }

   public List<eoh> c() {
      return this.a;
   }
}
