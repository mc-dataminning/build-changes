import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eca(List<ebp> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aiy c = new aiy("jigsaw");
   private static final Map<aiy, aiy> d = ImmutableMap.builder()
      .put(new aiy("nvi"), c)
      .put(new aiy("pcp"), c)
      .put(new aiy("bastionremnant"), c)
      .put(new aiy("runtime"), c)
      .build();

   public eca(List<ebp> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(hz $$0) {
      for (ebp $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public tt a(ecb $$0) {
      tc $$1 = new tc();

      for (ebp $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eca a(tc $$0, ecb $$1) {
      List<ebp> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         sw $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aiy $$6 = new aiy($$5);
         aiy $$7 = d.getOrDefault($$6, $$6);
         ecc $$8 = kf.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               ebp $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eca($$2);
   }

   public ebd b() {
      return ebp.a(this.a.stream());
   }

   public List<ebp> c() {
      return this.a;
   }
}
