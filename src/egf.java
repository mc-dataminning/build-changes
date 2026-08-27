import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record egf(List<efu> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ajv c = new ajv("jigsaw");
   private static final Map<ajv, ajv> d = ImmutableMap.builder()
      .put(new ajv("nvi"), c)
      .put(new ajv("pcp"), c)
      .put(new ajv("bastionremnant"), c)
      .put(new ajv("runtime"), c)
      .build();

   public egf(List<efu> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(id $$0) {
      for (efu $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public ul a(egg $$0) {
      tu $$1 = new tu();

      for (efu $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static egf a(tu $$0, egg $$1) {
      List<efu> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         to $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ajv $$6 = new ajv($$5);
         ajv $$7 = d.getOrDefault($$6, $$6);
         egh $$8 = kt.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               efu $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new egf($$2);
   }

   public efi b() {
      return efu.a(this.a.stream());
   }

   public List<efu> c() {
      return this.a;
   }
}
