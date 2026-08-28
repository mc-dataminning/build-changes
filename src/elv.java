import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record elv(List<elk> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ale c = ale.b("jigsaw");
   private static final Map<ale, ale> d = ImmutableMap.builder()
      .put(ale.b("nvi"), c)
      .put(ale.b("pcp"), c)
      .put(ale.b("bastionremnant"), c)
      .put(ale.b("runtime"), c)
      .build();

   public elv(final List<elk> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jf $$0) {
      for (elk $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vd a(elw $$0) {
      um $$1 = new um();

      for (elk $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static elv a(um $$0, elw $$1) {
      List<elk> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ug $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ale $$6 = ale.a($$5);
         ale $$7 = d.getOrDefault($$6, $$6);
         elx $$8 = lv.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               elk $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new elv($$2);
   }

   public eky b() {
      return elk.a(this.a.stream());
   }

   public List<elk> c() {
      return this.a;
   }
}
