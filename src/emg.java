import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record emg(List<elv> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alh c = alh.b("jigsaw");
   private static final Map<alh, alh> d = ImmutableMap.builder()
      .put(alh.b("nvi"), c)
      .put(alh.b("pcp"), c)
      .put(alh.b("bastionremnant"), c)
      .put(alh.b("runtime"), c)
      .build();

   public emg(final List<elv> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jg $$0) {
      for (elv $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vg a(emh $$0) {
      up $$1 = new up();

      for (elv $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static emg a(up $$0, emh $$1) {
      List<elv> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         uj $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         alh $$6 = alh.a($$5);
         alh $$7 = d.getOrDefault($$6, $$6);
         emi $$8 = lx.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               elv $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new emg($$2);
   }

   public elj b() {
      return elv.a(this.a.stream());
   }

   public List<elv> c() {
      return this.a;
   }
}
