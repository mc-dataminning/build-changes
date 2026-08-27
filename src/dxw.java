import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dxw(List<dxl> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final agi c = new agi("jigsaw");
   private static final Map<agi, agi> d = ImmutableMap.builder()
      .put(new agi("nvi"), c)
      .put(new agi("pcp"), c)
      .put(new agi("bastionremnant"), c)
      .put(new agi("runtime"), c)
      .build();

   public dxw(List<dxl> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ht $$0) {
      for (dxl $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public sw a(dxx $$0) {
      sf $$1 = new sf();

      for (dxl $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dxw a(sf $$0, dxx $$1) {
      List<dxl> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         rz $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         agi $$6 = new agi($$5);
         agi $$7 = d.getOrDefault($$6, $$6);
         dxy $$8 = jy.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dxl $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dxw($$2);
   }

   public dwz b() {
      return dxl.a(this.a.stream());
   }

   public List<dxl> c() {
      return this.a;
   }
}
