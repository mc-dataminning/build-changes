import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record emx(List<emm> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alj c = alj.b("jigsaw");
   private static final Map<alj, alj> d = ImmutableMap.builder()
      .put(alj.b("nvi"), c)
      .put(alj.b("pcp"), c)
      .put(alj.b("bastionremnant"), c)
      .put(alj.b("runtime"), c)
      .build();

   public emx(final List<emm> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jh $$0) {
      for (emm $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vi a(emy $$0) {
      ur $$1 = new ur();

      for (emm $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static emx a(ur $$0, emy $$1) {
      List<emm> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ul $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         alj $$6 = alj.a($$5);
         alj $$7 = d.getOrDefault($$6, $$6);
         emz $$8 = lz.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               emm $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new emx($$2);
   }

   public ema b() {
      return emm.a(this.a.stream());
   }

   public List<emm> c() {
      return this.a;
   }
}
