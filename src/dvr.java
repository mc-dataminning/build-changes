import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dvr(List<dvg> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aez c = new aez("jigsaw");
   private static final Map<aez, aez> d = ImmutableMap.builder()
      .put(new aez("nvi"), c)
      .put(new aez("pcp"), c)
      .put(new aez("bastionremnant"), c)
      .put(new aez("runtime"), c)
      .build();

   public dvr(List<dvg> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(gw $$0) {
      for (dvg $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public rq a(dvs $$0) {
      rc $$1 = new rc();

      for (dvg $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dvr a(rc $$0, dvs $$1) {
      List<dvg> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         qw $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aez $$6 = new aez($$5);
         aez $$7 = d.getOrDefault($$6, $$6);
         dvt $$8 = jb.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dvg $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dvr($$2);
   }

   public duu b() {
      return dvg.a(this.a.stream());
   }

   public List<dvg> c() {
      return this.a;
   }
}
