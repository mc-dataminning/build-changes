import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eob(List<enq> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aku c = aku.b("jigsaw");
   private static final Map<aku, aku> d = ImmutableMap.builder()
      .put(aku.b("nvi"), c)
      .put(aku.b("pcp"), c)
      .put(aku.b("bastionremnant"), c)
      .put(aku.b("runtime"), c)
      .build();

   public eob(final List<enq> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ji $$0) {
      for (enq $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public un a(eoc $$0) {
      tw $$1 = new tw();

      for (enq $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eob a(tw $$0, eoc $$1) {
      List<enq> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tq $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aku $$6 = aku.a($$5);
         aku $$7 = d.getOrDefault($$6, $$6);
         eod $$8 = mb.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               enq $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eob($$2);
   }

   public ene b() {
      return enq.a(this.a.stream());
   }

   public List<enq> c() {
      return this.a;
   }
}
