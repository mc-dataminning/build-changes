import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dvz(List<dvo> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aey c = new aey("jigsaw");
   private static final Map<aey, aey> d = ImmutableMap.builder()
      .put(new aey("nvi"), c)
      .put(new aey("pcp"), c)
      .put(new aey("bastionremnant"), c)
      .put(new aey("runtime"), c)
      .build();

   public dvz(List<dvo> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(gw $$0) {
      for (dvo $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public rs a(dwa $$0) {
      re $$1 = new re();

      for (dvo $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dvz a(re $$0, dwa $$1) {
      List<dvo> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         qy $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aey $$6 = new aey($$5);
         aey $$7 = d.getOrDefault($$6, $$6);
         dwb $$8 = jd.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dvo $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dvz($$2);
   }

   public dvc b() {
      return dvo.a(this.a.stream());
   }

   public List<dvo> c() {
      return this.a;
   }
}
