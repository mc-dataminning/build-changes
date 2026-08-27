import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fjx {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fjz e;

   public fjx(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fjx b();

   public abstract eym a(eym var1, fkb var2);

   public abstract static class a<R extends fjx> {
      protected final R a;
      protected final AbuseReportLimits b;

      protected a(R $$0, AbuseReportLimits $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public R e() {
         return this.a;
      }

      public UUID f() {
         return this.a.c;
      }

      public String g() {
         return this.a.d;
      }

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public fjz h() {
         return this.a.e;
      }

      public void a(fjz $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fjx.b c();

      public abstract Either<fjx.c, fjx.b> a(fkb var1);
   }

   public static record b(tn e) {
      public static final fjx.b a = new fjx.b(tn.c("gui.abuseReport.send.no_reason"));
      public static final fjx.b b = new fjx.b(tn.c("gui.chatReport.send.no_reported_messages"));
      public static final fjx.b c = new fjx.b(tn.c("gui.chatReport.send.too_many_messages"));
      public static final fjx.b d = new fjx.b(tn.c("gui.abuseReport.send.comment_too_long"));

      public euc a() {
         return euc.a(this.e);
      }

      public tn b() {
         return this.e;
      }
   }

   public static record c(UUID a, fka b, AbuseReport c) {
   }
}
