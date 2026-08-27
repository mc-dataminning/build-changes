import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dwp(List<dwe> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final afw c = new afw("jigsaw");
   private static final Map<afw, afw> d = ImmutableMap.builder()
      .put(new afw("nvi"), c)
      .put(new afw("pcp"), c)
      .put(new afw("bastionremnant"), c)
      .put(new afw("runtime"), c)
      .build();

   public dwp(List<dwe> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ht $$0) {
      for (dwe $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public sn a(dwq $$0) {
      rz $$1 = new rz();

      for (dwe $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dwp a(rz $$0, dwq $$1) {
      List<dwe> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         rt $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         afw $$6 = new afw($$5);
         afw $$7 = d.getOrDefault($$6, $$6);
         dwr $$8 = jy.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dwe $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dwp($$2);
   }

   public dvs b() {
      return dwe.a(this.a.stream());
   }

   public List<dwe> c() {
      return this.a;
   }
}
