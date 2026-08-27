import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ehy(List<ehn> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akm c = new akm("jigsaw");
   private static final Map<akm, akm> d = ImmutableMap.builder()
      .put(new akm("nvi"), c)
      .put(new akm("pcp"), c)
      .put(new akm("bastionremnant"), c)
      .put(new akm("runtime"), c)
      .build();

   public ehy(List<ehn> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(io $$0) {
      for (ehn $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public va a(ehz $$0) {
      uj $$1 = new uj();

      for (ehn $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ehy a(uj $$0, ehz $$1) {
      List<ehn> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ud $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akm $$6 = new akm($$5);
         akm $$7 = d.getOrDefault($$6, $$6);
         eia $$8 = le.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               ehn $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ehy($$2);
   }

   public ehb b() {
      return ehn.a(this.a.stream());
   }

   public List<ehn> c() {
      return this.a;
   }
}
