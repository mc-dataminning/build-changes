import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eor(List<eog> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alz c = alz.b("jigsaw");
   private static final Map<alz, alz> d = ImmutableMap.builder()
      .put(alz.b("nvi"), c)
      .put(alz.b("pcp"), c)
      .put(alz.b("bastionremnant"), c)
      .put(alz.b("runtime"), c)
      .build();

   public eor(final List<eog> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jh $$0) {
      for (eog $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vu a(eos $$0) {
      vd $$1 = new vd();

      for (eog $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eor a(vd $$0, eos $$1) {
      List<eog> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ux $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         alz $$6 = alz.a($$5);
         alz $$7 = d.getOrDefault($$6, $$6);
         eot $$8 = ma.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eog $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eor($$2);
   }

   public enu b() {
      return eog.a(this.a.stream());
   }

   public List<eog> c() {
      return this.a;
   }
}
