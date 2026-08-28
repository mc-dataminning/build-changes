import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record etc(List<esr> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alr c = alr.b("jigsaw");
   private static final Map<alr, alr> d = ImmutableMap.builder()
      .put(alr.b("nvi"), c)
      .put(alr.b("pcp"), c)
      .put(alr.b("bastionremnant"), c)
      .put(alr.b("runtime"), c)
      .build();

   public etc(final List<esr> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(iw $$0) {
      for (esr $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public va a(etd $$0) {
      ug $$1 = new ug();

      for (esr $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static etc a(ug $$0, etd $$1) {
      List<esr> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ua $$4 = $$0.b($$3);
         String $$5 = $$4.b("id", "").toLowerCase(Locale.ROOT);
         alr $$6 = alr.a($$5);
         alr $$7 = d.getOrDefault($$6, $$6);
         ete $$8 = mh.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               esr $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new etc($$2);
   }

   public esf b() {
      return esr.a(this.a.stream());
   }

   public List<esr> c() {
      return this.a;
   }
}
