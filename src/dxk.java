import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dxk(List<dwz> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final agg c = new agg("jigsaw");
   private static final Map<agg, agg> d = ImmutableMap.builder()
      .put(new agg("nvi"), c)
      .put(new agg("pcp"), c)
      .put(new agg("bastionremnant"), c)
      .put(new agg("runtime"), c)
      .build();

   public dxk(List<dwz> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ht $$0) {
      for (dwz $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public sw a(dxl $$0) {
      sf $$1 = new sf();

      for (dwz $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dxk a(sf $$0, dxl $$1) {
      List<dwz> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         rz $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         agg $$6 = new agg($$5);
         agg $$7 = d.getOrDefault($$6, $$6);
         dxm $$8 = jy.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dwz $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dxk($$2);
   }

   public dwn b() {
      return dwz.a(this.a.stream());
   }

   public List<dwz> c() {
      return this.a;
   }
}
