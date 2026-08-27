import com.google.common.collect.Lists;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportChatMessage;
import com.mojang.authlib.minecraft.report.ReportEvidence;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fjd {
   private final fjd.b a;
   private final AbuseReportLimits b;

   public fjd(fjd.b $$0, AbuseReportLimits $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fjd(UUID $$0, AbuseReportLimits $$1) {
      this.a = new fjd.b(UUID.randomUUID(), Instant.now(), $$0);
      this.b = $$1;
   }

   public fjd.b a() {
      return this.a;
   }

   public UUID b() {
      return this.a.d;
   }

   public IntSet c() {
      return this.a.e;
   }

   public String d() {
      return this.a.f;
   }

   public void a(String $$0) {
      this.a.f = $$0;
   }

   @Nullable
   public fjg e() {
      return this.a.g;
   }

   public void a(fjg $$0) {
      this.a.g = $$0;
   }

   public void a(int $$0) {
      this.a.a($$0, this.b);
   }

   public boolean b(int $$0) {
      return this.a.e.contains($$0);
   }

   public boolean f() {
      return StringUtils.isNotEmpty(this.d()) || !this.c().isEmpty() || this.e() != null;
   }

   @Nullable
   public fjd.a g() {
      if (this.a.e.isEmpty()) {
         return fjd.a.b;
      } else if (this.a.e.size() > this.b.maxReportedMessageCount()) {
         return fjd.a.c;
      } else if (this.a.g == null) {
         return fjd.a.a;
      } else {
         return this.a.f.length() > this.b.maxOpinionCommentsLength() ? fjd.a.d : null;
      }
   }

   public Either<fjd.c, fjd.a> a(fjh $$0) {
      fjd.a $$1 = this.g();
      if ($$1 != null) {
         return Either.right($$1);
      } else {
         String $$2 = Objects.requireNonNull(this.a.g).a();
         ReportEvidence $$3 = this.a($$0.b());
         ReportedEntity $$4 = new ReportedEntity(this.a.d);
         AbuseReport $$5 = new AbuseReport(this.a.f, $$2, $$3, $$4, this.a.c);
         return Either.left(new fjd.c(this.a.b, $$5));
      }
   }

   private ReportEvidence a(fiw $$0) {
      List<ReportChatMessage> $$1 = new ArrayList<>();
      fje $$2 = new fje(this.b.leadingContextMessageCount());
      $$2.a($$0, this.a.e, ($$1x, $$2x) -> $$1.add(this.a($$2x, this.b($$1x))));
      return new ReportEvidence(Lists.reverse($$1));
   }

   private ReportChatMessage a(fiz.a $$0, boolean $$1) {
      tz $$2 = $$0.g().j();
      tx $$3 = $$0.g().l();
      List<ByteBuffer> $$4 = $$3.d().a().stream().map(tq::a).toList();
      ByteBuffer $$5 = x.a($$0.g().k(), tq::a);
      return new ReportChatMessage($$2.b(), $$2.c(), $$2.d(), $$3.b(), $$3.c(), $$4, $$3.a(), $$5, $$1);
   }

   public fjd h() {
      return new fjd(this.a.a(), this.b);
   }

   public static record a(tf e) {
      public static final fjd.a a = new fjd.a(tf.c("gui.chatReport.send.no_reason"));
      public static final fjd.a b = new fjd.a(tf.c("gui.chatReport.send.no_reported_messages"));
      public static final fjd.a c = new fjd.a(tf.c("gui.chatReport.send.too_many_messages"));
      public static final fjd.a d = new fjd.a(tf.c("gui.chatReport.send.comments_too_long"));

      public tf a() {
         return this.e;
      }
   }

   public class b {
      final UUID b;
      final Instant c;
      final UUID d;
      final IntSet e = new IntOpenHashSet();
      String f = "";
      @Nullable
      fjg g;

      b(UUID $$1, Instant $$2, UUID $$3) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(int $$0, AbuseReportLimits $$1) {
         if (this.e.contains($$0)) {
            this.e.remove($$0);
         } else if (this.e.size() < $$1.maxReportedMessageCount()) {
            this.e.add($$0);
         }
      }

      public fjd.b a() {
         fjd.b $$0 = fjd.this.new b(this.b, this.c, this.d);
         $$0.e.addAll(this.e);
         $$0.f = this.f;
         $$0.g = this.g;
         return $$0;
      }

      public boolean a(UUID $$0) {
         return $$0.equals(this.d);
      }
   }

   public static record c(UUID a, AbuseReport b) {
   }
}
