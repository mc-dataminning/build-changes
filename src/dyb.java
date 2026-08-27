import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dyb(List<dxq> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final agm c = new agm("jigsaw");
   private static final Map<agm, agm> d = ImmutableMap.builder()
      .put(new agm("nvi"), c)
      .put(new agm("pcp"), c)
      .put(new agm("bastionremnant"), c)
      .put(new agm("runtime"), c)
      .build();

   public dyb(List<dxq> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(hx $$0) {
      for (dxq $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public ta a(dyc $$0) {
      sj $$1 = new sj();

      for (dxq $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dyb a(sj $$0, dyc $$1) {
      List<dxq> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         sd $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         agm $$6 = new agm($$5);
         agm $$7 = d.getOrDefault($$6, $$6);
         dyd $$8 = kc.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dxq $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dyb($$2);
   }

   public dxe b() {
      return dxq.a(this.a.stream());
   }

   public List<dxq> c() {
      return this.a;
   }
}
